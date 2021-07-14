public class AutoZadanie {

        public String marka;
        public String model;
        public int rokProdukcji;
        public int przebieg;

        public AutoZadanie(){

        }

        public AutoZadanie(String marka, String model, int rokProdukcji, int przebieg) {
            this.marka = marka;
            this.model = model;
            this.rokProdukcji = rokProdukcji;
            this.przebieg = przebieg;
        }

        public void jedz() { System.out.println("Jedź " + marka + "!");}

        public void hamuj() {
            System.out.println("Hamuj " + marka + "!");
        }


        public void info() {
            System.out.println("Marka: " + marka);
            System.out.println("Model: " + model);
            System.out.println("Rok produkcji: " + rokProdukcji + "r");
            System.out.println("Przebieg: " + przebieg + " km");

        }
    }

