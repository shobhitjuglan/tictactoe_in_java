
import java.util.Scanner;



public class tictactoe{

static char[] board_new(char[] arr, int change, int turn){
    char[] new_arr = arr;
    char symbol;
    if(turn%2 == 0) symbol = 'O';
    else symbol = 'X';
    switch(change){
        case 1 :{
            arr[0] = symbol;
            break;
        }
        case 2 :{
            arr[2] = symbol;
            break;
        }
        case 3 :{
            arr[4] = symbol;
            break;
        }
        case 4 :{
            arr[5] = symbol;
            break;
        }
        case 5 :{
            arr[7] = symbol;
            break;
        }
        case 6 :{
            arr[9] = symbol;
            break;
        }
        case 7 :{
            arr[10] = symbol;
            break;
        }
        case 8 :{
            arr[12] = symbol;
            break;
        }
        case 9 :{
            arr[14] = symbol;
            break;
        }
    }
    return new_arr;
}

static void print_board(char[] arr){

    for(int i=0; i<3;i++){
        for(int j=0;j<5;j++){
            System.out.print(arr[5*i+j]);
        }
        System.out.println();
    }

}

//function to check if the player has won or not at that particular chance
static boolean check(char[] arr){
    boolean win = false;
    for(int i=0;i!=15;i+=5)
    {if(arr[i]==arr[i+2]&&arr[i+2]==arr[i+4]){
        win = true;}}
    for(int i=0;i!=6;i+=2)
    {if(arr[i]==arr[i+5]&&arr[i+5]==arr[i+10]){
        win = true;}}
    if((arr[4]==arr[7]&&arr[7]==arr[10])||(arr[0] == arr[7] && arr[7]== arr[14])) win = true;
    return win;

}

//function to beautify the gui ;)
static void space(){
    int space = 3;
    while(space>0){
        System.out.println();
        space--;
    }
}

//function of one vs one player
static void onevsone(){

    space();
    System.out.println("Welcome to one vs one match");
    System.out.println("Player 1 <X> - Player 2 <O>");
    System.out.println("Board numbers are as follows");
    char[] board = {'1', '|', '2','|','3','4','|','5','|','6','7','|','8','|','9'};
    
    print_board(board);
    space();
    
    for(int turn=1; turn<10; turn++){
        System.out.println("Turn "+turn);
        System.out.println("It's Player 1's turn, enter your desired location[1-9]");
        Scanner sc1 = new Scanner(System.in);
        int option1 = sc1.nextInt();
        // System.out.println("helo");
        board = board_new(board,option1,turn);
        print_board(board);
        if(check(board)){
            System.out.println("Player 1 won!");
            return;
        }

        space();

        turn++;
        if(turn==10) break;
        System.out.println("Turn "+turn);
        System.out.println("It's Player 2's turn, enter your desired location[1-9]");
        Scanner sc2 = new Scanner(System.in);
        int option2 = sc2.nextInt();
        board = board_new(board,option2,turn);
        print_board(board);
        if(check(board)){
            System.out.println("Player 2 won!");
            return;
        }
        space();
    }
    System.out.println("The game is a tie");
    return;

}

static void computer(){

    space();
    System.out.println("Welcome to one vs computer match");
    System.out.println("Player 1 <X> - Computer <O>");
    System.out.println("Board numbers are as follows");
    char[] board = {'1', '|', '2','|','3','4','|','5','|','6','7','|','8','|','9'};
    
    print_board(board);
    space();
    
    for(int turn=1; turn<10; turn++){
        System.out.println("Turn "+turn);
        System.out.println("It's Player 1's turn, enter your desired location[1-9]");
        Scanner sc1 = new Scanner(System.in);
        int option1 = sc1.nextInt();
        // System.out.println("helo");
        board = board_new(board,option1,turn);
        print_board(board);
        if(check(board)){
            System.out.println("Player 1 won!");
            return;
        }

        space();

        turn++;
        if(turn==10) break;
        // System.out.println("Turn "+turn);
        // System.out.println("It's Player 2's turn, enter your desired location[1-9]");
        // Scanner sc2 = new Scanner(System.in);
        // int option2 = sc2.nextInt();
        
        int option2 = 1;
        // if(board[])
        boolean condn = true;
        while(condn){
        switch(option2){
            case 1 :{
                // arr[0] = symbol;
                // break;
                if(board[0]!='X' && board[0]!='O') condn = false;
                else option2++;
                break;
            }
            case 2 :{
                // arr[2] = symbol;
                // break;
                if(board[2]!='X' && board[2]!='O') condn = false;
                else option2++;
                break;
            }
            case 3 :{
                // arr[4] = symbol;
                // break;
                if(board[4]!='X' && board[4]!='O') condn = false;
                else option2++;
                break;
            }
            case 4 :{
                // arr[5] = symbol;
                // break;
                if(board[5]!='X' && board[5]!='O') condn = false;
                else option2++;
                break;
            }
            case 5 :{
                // arr[7] = symbol;
                // break;
                if(board[7]!='X' && board[7]!='O') condn = false;
                else option2++;
                break;
            }
            case 6 :{
                // arr[9] = symbol;
                // break;
                if(board[9]!='X' && board[9]!='O') condn = false;
                else option2++;
                break;
            }
            case 7 :{
                // arr[10] = symbol;
                // break;
                if(board[10]!='X' && board[10]!='O') condn = false;
                else option2++;
                break;
            }
            case 8 :{
                // arr[12] = symbol;
                // break;
                if(board[12]!='X' && board[12]!='O') condn = false;
                else option2++;
                break;
            }
            case 9 :{
                break;
            }
        }
    }
        System.out.println("Computer picked "+ option2);
        board = board_new(board,option2,turn);
        print_board(board);
        if(check(board)){
            System.out.println("Player 2 won!");
            return;
        }
        space();
    }
    System.out.println("The game is a tie");
    return;

}
public static void main(String[] args){
    System.out.println("Welcome to Tic Tac Toe. For playing with computer type:1, for playing with another player type:2");
    Scanner sc = new Scanner(System.in);
    int option = sc.nextInt();
    if(option == 2) onevsone();
    else if(option == 1) computer();
}

}
