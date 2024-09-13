Import java.io.*;
Public class command line calculator {
Public static void main (string [] args){
If((args.length!=3){
System.out.println("command line argument");
Return;
}
String operation=args[0];
Double num1=
Double.parseDouble(args[1]);
double num 2=
Double.parseDouble(args[2]);
Double result=0;
Switch(operation){
Case"1":
Result=num1+num2;
System.out.println("addition result:"+result);
break;a
Case"2":
result=num1-num2;
System.out.println("subtraction result:"+result);
Break;
Case "3":
result=num1*num2;
System.out.println("multiplication result:"+result);
Break;
Case"4":
if(num 2==0){
    system.out.println("Error: division by zero is not allowed");
}
else{
    result=num1/num2;
    system.out.println("division result:"+result);
}
break;
default:
system.out.println("invalid operation.please choose 1 for addition,2 for subtraction,3 for Multiplication,or 4 for Division ");
}
}
    
}
