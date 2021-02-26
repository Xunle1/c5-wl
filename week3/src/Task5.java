public class Task5 {
    static class TCPException extends Exception {
        public TCPException() {}

        public TCPException(String message) {
            super(message);
        }
    }

    public static void division(int i, int j) throws TCPException{
        if (j == 0) {
            throw new TCPException("除数不能为零");
        }
    }

    public static void main(String[] args) throws TCPException{
        try {
            division(3, 0);
        } catch (TCPException e) {
            System.out.println(e.getMessage());
        }
    }
}
