public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelect = "Dark";
        switch (colorModeSelect) {
            case "Light":
                System.out.println("Seleccionaste Ligth Mode");
                break;
            case "Dark":
                System.out.println("Selecccionaste el Dark Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            case "Nigth":
                System.out.println("Seleccionaste Nigth MOde");
                break;
            default:
                System.out.println("Selecciona una opcción.");
        }
    }
}
