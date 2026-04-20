
#include <stdio.h>
#include <math.h>
void main(){
    // 1) float f;
    // printf("enter the value of tempertaure in farhenite:");
    // scanf("%f",&f);
    // float c=(float) 9/5*f+32;
    // printf("the temerture is %f",c);

// 2)
// float radius;
// printf("enter the value of radius :");
//     scanf("%f",&radius);
//     float area=(float)22/7*radius*radius;
//     float circumeference=(float) 2*22/7*radius;
//     printf("area is %f and circumfreence is %f",area,circumeference);
// int i=1;
// while(i<=100){
//     printf("%d\n",i);
//     i++;
// }


//  int n, ans=0;
//     printf("enter the number:");
//     scanf("%d",&n);
//     while(n!=0){
//         ans+=(n%10);
//         n/=10;
//     }
//     printf("%d",ans);


// int n, ans=0;
//     printf("enter the number:");
//     scanf("%d",&n);
//     while(n!=0){
//         ans=(n%10)+ans*10;
//         n/=10;
//     }
//     printf("%d\n",ans);
//     if(ans==n){
//         printf(" is palindrome");}
//         else{
//             printf("no palindrome");
//         }

// int i=1,sum=0,n;
//   printf("enter the number:");
//     scanf("%d",&n);
//     while(i<n){
//         if(n%i==0){
//             sum+=i;
//             i++;
//         }
//         else{
//             i++;
//         }
//     }
//     if(sum==n){
//         printf("it is perfetc no ");
//     }
//     else{
//         printf("it is not perfect no");
//     }

// int n, long fact=1 ,i=1;
//  printf("enter the number:");
//     scanf("%d",&n);
//     do{
//         fact*=i;i++;
//     }while(i<=n);
//     printf("%d",fact);

// int num,n=0,remainder;
// float result;
// // count no of digit
// printf("enter the number:");
//     scanf("%d",&num);
//     while(num!=0){
//         num/=10;
//         n++;
        
//     }
//     while(num!=0){
//         remainder=num%10;
//         result+=pow(remainder,n);
//         n/=10;

//     }
//     if((int)result==num){
//         printf("no is armstrong");
//     }
//     else{
//         printf("it is not armstrong");
//     }


// #include <stdio.h>
#include <math.h> // Iske bina pow aur sqrt kaam nahi karenge


    // double p = pow(5, 2);   // 5 ki power 2 = 25
    // double s = sqrt(25);    // 25 ka root = 5

    // // printf("Power: %lf \n", p);
    // // printf("Square Root: %lf",s);
    // printf("Power: %.2f \n", p);
    // printf("Square Root: %.2f", s);

    
// int n,x,i=1;
// long sum=1,term=1;
//  printf("enter the number:");
//    scanf("%d %d",&n,&x);
//    while(i<=n){
//     term=term*x;
//     sum=term+sum;
//     i++;
//    }
//    printf("sum is %ld",sum);






    // char op;
    // float num1, num2, result;

    // printf("Operator enter karein (+, -, *, /): ");
   
    // scanf(" %c", &op);

    // printf("Do numbers enter karein (e.g. 10.5 5.2): ");
    
    // scanf("%f %f", &num1, &num2);

    // switch(op) {
    //     case '+':
        
    //         result = (float)num1 + num2;
    //         printf(" %f" ,result);
    //         break;

    //     case '-':
    //     if(num1>num2){
    //         result = (float)num1 - num2;}
    //         else{
    //               result = (float)(-(num2 - num1));
    //         }
    //         printf(" %f" ,result);
    //         break;

    //     case '*':
    //         result = (float)num1 * num2;
    //         printf(" %f" ,result);
    //         break;

    //     case '/':
    //         // Division by zero check
    //         if(num2 != 0) {
    //             result = (float)num1 / num2;
    //             printf(" %f" ,result);
    //         } else {
    //             printf("Error! Zero se divide nahi kar sakte.\n");
    //         }
    //         break;

    //     default:
    //         printf("Error! Galat operator.\n");
    // }


  
    // int day = 3; // Maan lo 3rd day hai

    // switch(day) {
    //     case 1:
    //         printf("Monday");
    //         break;
    //     case 2:
    //         printf("Tuesday");
    //         break;
    //     case 3:
    //         printf("Wednesday"); // Ye wala print hoga
    //         break;
    //     case 4:
    //         printf("Thursday");
    //         break;
    //     // ... baaki cases
    //     default:
    //         printf("Invalid Day!");
    // }

// float a,b,c,r1,r2,d;
// printf("enter cofficient of ewuation:");
// scanf("%f %f %f",&a,&b,&c);
// d=(float)b*b-4*a*c;
// if(d>0){
//     r1= (float)(-b+sqrt(d))/2*a;
//     r2= (float)(-b-sqrt(d))/2*a;
//     printf(" root are r1=%f r2=%f",r1 ,r2);
// }
// else if(d==0){
//     r1=r2= (float)(-b)/2*a;
//      printf(" root are r1=%f r2=%f",r1 ,r2);
// }
// else {
//     printf("root are imaginary");
// }



// for(int i=1;i<=2;i++){
//     printf("%d\n",i);
// }





// unit 3 array and fn 
// array ko input and then print ;
// int n;
//  scanf("%d",&n);
// int arr[n];
// for(int i=0;i<n;i++){
//     scanf("%d",&arr[i]);
// }
// for(int i=0;i<n;i++){
//     printf("%d\n",arr[i]);
// }


// largest elemnt 
// int n;int max;int i;
//  scanf("%d",&n);
// int arr[n];
// for(i=0;i<n;i++){
//     scanf("%d",&arr[i]);
//     max=arr[i];
//     if(arr[i]>max){
//         max=arr[i];
//     }
// }
// printf("%d", max);

// selection sort
// int n;int i,mindx,min,j;
//  scanf("%d",&n);
// int arr[n];
// for( i=0;i<n;i++){
//     scanf("%d",&arr[i]);
// }

// for( i=0;i<n-1;i++){
//     for( j=i;j<n;j++){
//          min = arr[i]; 
//         mindx = i;
        
//         if(arr[j]<min){
//             min=arr[j];
//             mindx=j;
//         }}
//         int temp=arr[i];
//         arr[i]=arr[mindx];
//         arr[mindx]=temp;
    

// }
// for(int i=0;i<n;i++){
//     printf("%d\n",arr[i]);
// }




// sort in descending order

// int n;int i,j;
//  scanf("%d",&n);
// int arr[n];
// for( i=0;i<n;i++){
//     scanf("%d",&arr[i]);
// }

// for( i=0;i<n-1;i++){
//     for( j=i+1;j<n;j++){
        
        
//         if(arr[j]>arr[i]){
           
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;}
    

// }
// }
// for(int i=0;i<n;i++){
//     printf("%d\n",arr[i]);
// }



// ascending
// int n;int i,j;
//  scanf("%d",&n);
// int arr[n];
// for( i=0;i<n;i++){
//     scanf("%d",&arr[i]);
// }

// for( i=0;i<n-1;i++){
//     for( j=i+1;j<n;j++){
        
        
//         if(arr[j]<arr[i]){
           
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;}
    

// }
// }
// for(int i=0;i<n;i++){
//     printf("%d\n",arr[i]);
// }


// part 2 2d array addition sub multiply print karn take input yahi sab karo pahle 

// int m,n,i,j;

//  scanf("%d",&n);
//  scanf("%d",&m);int arr[m][n];


// for( i=0;i<m;i++){
//     for( j=0;j<n;j++){

//     scanf("%d",&arr[i][j]);}
// }
// for( i=0;i<m;i++){
//     for( j=0;j<n;j++){

//     printf("%d\t",arr[i][j]);}
//     printf("\n");
// }

// add/multiply/divide 









    
}