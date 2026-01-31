package Animales;
public class MainAnimal {
    public static void main(String[] args) {
        Perro p = new Perro("Boby");
        Gato g = new Gato("Fabian");
        Tiburon t = new Tiburon("Nemo");
        PezPayaso pp = new PezPayaso("Dory");

                System.out.println("=== COMUNICACIÓN (SOBRESCRITURA) ===");
                p.comunicarse();
                g.comunicarse();
                t.comunicarse();
                pp.comunicarse();

                System.out.println("\n=== MAMAR (SOLO MAMÍFEROS) ===");
                p.mamar();
                g.mamar();

                System.out.println("\n=== RESPIRAR ===");
                p.respirar();
                g.respirar();
                t.respirar();
                pp.respirar();

                System.out.println("\n=== MOVERSE ===");
                p.moverse();
                g.moverse();
                t.moverse();
                pp.moverse();

                System.out.println("\n=== INTERFAZ JUGAR ===");
                g.saltarPorUnAro();
                g.perseguirUnObjeto("ratón");
                t.saltarPorUnAro();
                t.perseguirUnObjeto("pez pequeño");

                System.out.println("\n=== ENTRENADOR ===");
                Entrenador e = new Entrenador("Carlos");

                System.out.println("Entrenando gato:");
                e.entrenar(g);

                System.out.println("Entrenando tiburón:");
                e.entrenar(t);

                System.out.println("\n=== PROBAR instanceof ===");
                try {
                    e.dejarEntrar(p);
                } catch (IllegalArgumentException ex) {
                System.out.println("No puede entrar: " + ex.getMessage());
                }
                e.dejarEntrar(g);
            }
        }