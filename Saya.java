//  Objek class
public class Saya {
    public int id;
    public String nama;
    public double ipk;

    /* constraktor nama sama dng nama Class*/
        public Saya() {
            id = 0;
            nama = "";
            ipk = 0;
        }
        // constraktor Paramater
        public Saya(int id, String nama, double ipk){
            this.id = id;
            this.nama = nama;
            this.ipk = ipk;
        }

        //  Getter --> mendapatkan nilai-->tip data
        public int getId(){
           return id;
        }
        
        public String getNama() {
            return nama;
        }

        public double getIpk(){
            return ipk;
        }

        // setter--> mengubah nilai --> void
        public void setId(int id) {
            this.id = id;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public void setIpk(double ipk) {
            this.ipk = ipk;
        }

        // method tdk menghasilkan value
        public void print() {
            System.out.println("ID :" + id);
            System.out.println("Nama :" + nama);
            System.out.println("IPK :" + ipk);
        }

        // method yang menghasilkan value 
        public String print2() {
            return "ID : " + id + "\nNama : " + nama + "\nIPK : " + ipk;
        
        }
    }

