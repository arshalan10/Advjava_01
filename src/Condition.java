public class Condition {
    static void main(String[] args) {

        int c=58;
        int t=58;
        int b=57;

        if(c==b && c==t && t==b){
            System.out.printf("Vote is draw among Cpml,TMC and BJP");
        } else if(c>t) {
            if(c>b){
                System.out.printf("Cpml is won");
            } else if(c==b){
                System.out.printf("Draw Between Cpml and BJP");
            } else if(c==t){
                System.out.printf("Draw Between Cpml and TMC");
            }
        } else if(t>b){
            if(t==b){
                System.out.printf("Draw Between TMC and BJP");
            } else if(t==c){
                System.out.printf("Draw Between TMC and Cpml");
            }else {
                System.out.printf("TMC is won");
            }
        }
        else if(b>c){
            if(b==t){
                System.out.printf("Draw Between BJP and TMC");
            } else if(b==c){
                System.out.printf("Draw Between BJP and Cpml");
            }else {
                System.out.printf("BJP is won");
            }
        }
    }
}
