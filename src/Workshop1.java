void main() {
    IO.println("1. admin");
    IO.println("2. user");
    IO.println("3. guest");
    IO.println("4. operator");

    int roli = Integer.parseInt(IO.readln("Roli (1-4): "));

    int niveli = switch (roli) {
        case 1 -> 3;
        case 2 -> 2;
        case 3 -> 1;
        case 4 -> 2;
        default -> 0;
    };

    if (niveli == 0) {
        IO.println("Rol i panjohur.");
    } else {
        if (roli == 3) {
            IO.println("Mysafir: vetëm lexim, pa fjalëkalim.");
        } else {
            String user = IO.readln("Përdoruesi: ").trim().toLowerCase();
            String pass = IO.readln("Fjalëkalimi: ");

            if (pass.isEmpty()) {
                IO.println("Fjalëkalimi s'mund të jetë bosh.");
            } else {
                boolean sakte = false;

                if (roli == 1 && user.equals("admin") && pass.equals("S3kret!2026")) {
                    sakte = true;
                }
                if (roli == 2 && user.equals("arta") && pass.equals("arta2026")) {
                    sakte = true;
                }
                if (roli == 4 && user.equals("operator") && pass.equals("Op3r!2026")) {
                    sakte = true;
                }

                String msg = sakte ? "Hyrje e suksesshme." : "Përdorues ose fjalëkalim i gabuar.";
                IO.println(msg);

                if (sakte) {
                    double gb = niveli * 2.5;
                    System.out.printf("Hapësira juaj: %.2f GB%n", gb);
                }
            }
        }
    }
}
