import javax.print.DocFlavor.STRING;

public class Opps {
    public static void main(String[] args) {
        Pen p1 = new Pen();// constuctor - created a pen object called p1
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        //p1.setColor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);


        BankAccount myyACC = new BankAccount();
        myyACC.username = "gunjanpandey";
        // myyACC.password "cvbn";
        myyACC.Setpassword("abcdf");

        
            }
        }
class Pen {
        String color;
        int tip;
        
        String getColor(){
            return this.color;
        }
            int getTip(){
                return this.tip;
            }
            void setcolor(String newColor){ //setters
                this.color = newColor;
            }
            void setTip(int newTip){
                this.tip = newTip;
        
            }
        }
        
class BankAccount{
        public String username; // public access
        private String password; // private access modifier
    public void Setpassword(String pwd){
        password = pwd;
    }
}