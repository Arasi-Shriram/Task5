
    class AgeException extends Exception {
        AgeException(String msg) {
            super(msg);
        }
    }

    class Custom {
        static void checkAge(int age) throws AgeException {
            if (age < 18) throw new AgeException("Must be 18 or older.");
            System.out.println("Eligible to vote.");
        }

        public static void main(String[] args) {
            try {
                checkAge(21);  // Change the value to test different cases
            } catch (AgeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


