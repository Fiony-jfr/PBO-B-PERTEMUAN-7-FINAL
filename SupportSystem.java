public class SupportSystem {
    private Input input;
    private Responder responder;

    public SupportSystem() {
        input = new Input();
        responder = new Responder();
    }

    public void start() {
        System.out.println("=== Tech Support System Online ===");
        System.out.println("Selamat datang. Deskripsikan masalah teknis Anda.");
        System.out.println("Ketik 'bye' untuk keluar.\n");

        boolean running = true;
        while (running) {
            // 1. Ambil Input
            String userRequest = input.getInput();

            // 2. Cek kondisi keluar
            if (userRequest.startsWith("bye")) {
                running = false;
            } else {
                // 3. Proses via Responder
                String response = responder.generateResponse(userRequest);
                System.out.println(response);
            }
        }

        System.out.println("System shutting down...");
    }

    // Entry Point Java
    public static void main(String[] args) {
        SupportSystem system = new SupportSystem();
        system.start();
    }
}
