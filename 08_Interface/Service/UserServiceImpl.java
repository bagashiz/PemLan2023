package Service;

import Entity.User;

// interface untuk operasi CRUD entity User
interface UserService {
    void createUser(String username, String password);

    void readUser(String username);

    void updateUser(String username, String password);

    void deleteUser(String username);
}

// implementasi UserService
public class UserServiceImpl implements UserService {
    private User[] users;
    private int userCount;

    public UserServiceImpl() {
        this.users = new User[10]; // maksimal 10 user
        this.userCount = 0;
    }

    @Override
    public void createUser(String username, String password) {
        // cek apakah user sudah ada
        if (findUserByUsername(username) != -1) {
            System.out.println("Username sudah ada");
            return;
        }

        // Cek apakah sudah mencapai batas maksimal user
        if (userCount == users.length) {
            System.out.println("Kapasitas user penuh. Gagal membuat user.");
            return;
        }

        User newUser = new User(username, password);
        users[userCount] = newUser;
        userCount++;

        System.out.println("User " + username + " berhasil dibuat");
    }

    @Override
    public void readUser(String username) {
        int index = findUserByUsername(username);

        if (index != -1) {
            User user = users[index];
            System.out.println("Username: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
        } else {
            System.out.println("User " + username + " tidak ditemukan.");
        }
    }

    @Override
    public void updateUser(String username, String password) {
        int index = findUserByUsername(username);
        if (index != -1) {
            User user = users[index];
            user.setPassword(password);
            System.out.println("User " + username + " berhasil diperbarui.");
        } else {
            System.out.println("User " + username + " tidak ditemukan. Gagal memperbarui user.");
        }
    }

    @Override
    public void deleteUser(String username) {
        int index = findUserByUsername(username);

        if (index != -1) {
            User[] newUsers = new User[users.length - 1];
            for (int i = 0, j = 0; i < users.length; i++) {
                if (i != index) {
                    newUsers[j] = users[i];
                    j++;
                }
            }

            users = newUsers;
            userCount--;

            System.out.println("User " + username + " berhasil dihapus.");
        } else {
            System.out.println("User " + username + " tidak ditemukan. Gagal menghapus user.");
        }
    }

    // Method untuk mencari user berdasarkan username
    private int findUserByUsername(String username) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUsername().equals(username)) {
                return i;
            }
        }

        // jika tidak ada return -1
        return -1;
    }
}
