
import java.util.Scanner;
public class tictactoe {
  public static void main(String[] args) {
        char[][]arr=new char[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                  arr[i][j]=' ';
            }
        }
        char player='X';
        boolean gameover=false;
        Scanner sc=new Scanner(System.in);
        while(!gameover){
            printarr(arr);
            System.out.println("Hey! | "+player+" | Enter your Index:");
            int i=sc.nextInt();
            int j=sc.nextInt();
            System.out.println();
        if(arr[i][j]==' '){
           arr[i][j]=player;
           gameover=haveOwn(arr,player);
           if(gameover){
            System.out.println("| "+player+" | WON 🤗");
            return;
           }else{
             player=(player=='X')?'O':'X';
           }
        }else{
            System.out.println("invalid");
        }
    }
    printarr(arr);
  }

public static boolean haveOwn(char [][] arr, char player) {
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
          if(arr[0][i]==player&&arr[1][i]==player&&arr[2][i]==player){
         return true;
}      
}
    }
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
          if(arr[j][0]==player&&arr[j][1]==player&&arr[j][2]==player){
         return true;
}      
}
    }
    if(arr[0][0]==player&&arr[1][1]==player&&arr[2][2]==player){
        return true;
    }
        if(arr[2][0]==player&&arr[1][1]==player&&arr[0][2]==player){
            return true;
        }
return false;
}

public static void printarr(char[][] arr) {
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
              System.out.print(arr[i][j]+" | ");
        }
        System.out.println();
}
System.out.println();
}
}
