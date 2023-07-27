public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSend = 3;

        if (isBluetoothEnabled){
            //Send file
            fileSend++;
            System.out.println("File sent.");
        }
        else {
            System.out.println("Please turn on Bluetooth");
        }
    }
}
