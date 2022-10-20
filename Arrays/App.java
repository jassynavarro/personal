public class App {

    public static void main(String[] args) {
    
char[] myName = {'J', 'A', 'S', 'C', 'E', 'N', 'T'};
System.out.println(myName[0]);

for (int i = 0; i < myName.length; i++) {
   System.out.print(myName[i]);
    
   if (!(myName[i] == 'A' || myName[i] == 'E' || myName[i] == 'I' || myName[i] == 'O' || myName[i] == 'U')) {
    System.out.print(myName[i]);
   } 
}

for (int i = myName.length - 1; i >= 0; i--) {
    System.out.print(myName[i]);
}

    }
}
