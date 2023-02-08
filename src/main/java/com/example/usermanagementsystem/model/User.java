package com.example.usermanagementsystem.model;

public class User {
        private int userId;
        private String name;
        private String userName;
        private String address;
        private long phoneNumber;

        public User(){

        }

        public User(int userId, String name, String userName, String address, long phoneNumber){
            this.userId = userId;
            this.name = name;
            this.userName = userName;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return "User{" +
                    "userId=" + userId +
                    ", name='" + name + '\'' +
                    ", userName='" + userName + '\'' +
                    ", address='" + address + '\'' +
                    ", phoneNumber=" + phoneNumber +
                    '}';
        }
    }