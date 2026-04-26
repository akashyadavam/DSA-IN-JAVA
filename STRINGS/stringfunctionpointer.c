// #include <stdio.h>
// #include <math.h>
// // #include<string.h>
// //  long int fact(int);
// long int  fact(long );
// void   main(){
//  long int f;
// int n;
// scanf("%d",&n);
// f=fact(n);
// printf("%ld",f);














// }
// long int fact(long x){
//     if(x==1||x==0){
//  return 1;}
    
   
//     return x*fact(x-1);
// }
// // int fibo(int x){
// //     if(x==2||x==1){
// //         return 1;
// //     }
// //     else{
// //         return fibo(x-1)+fibo(x-2);
// //     }
// // }


//pointers
     
//  #include <stdio.h>
//   void swap(int *,int *);
//  void main(){
//     int a=1;
//     int b=2;
//     swap(&a,&b);
//     printf("%d %d",a,b);

// }
//  void swap(int *x,int *y){
//     int temp=*x;//*x address jo x ke andar jis variable ja hai use point karenga uske andar jo hai value;
//     *x=*y;
//     *y=temp;
    

//  }


//  #include <stdio.h>
//  int max(int *,int);
//  void main(){
    // int arr[5];
    // int *p=&arr[0];
    // for(int i=0;i<5;i++){
    //     scanf("%d",(p+i));
    // }
    // int max=*p;
    // for(int i=0;i<5;i++){
        
        
    //     if(max<*(p+i)){
    //         max=*(p+i);
    //     }
    // }
    // printf("%d",max);



    //  int arr[5];
    // int *p=&arr[0];
    // for(int i=0;i<5;i++){
    //     scanf("%d",(p+i));
    // }

    // for(int i=0;i<4;i++){
    //     for(int j=i+1;j<5;j++){
    //         if(*(p+i)>*(p+j)){
    //             int temp=*(p+i);
    //             *(p+i)=*(p+j);
    //             *(p+j)=temp;

    //         }
    //     }

    // }
    //  for(int i=0;i<5;i++){
    //     printf("%d",*(p+i));
    // }




    //printing max element fn call by refrence



   

//  }



// #include <stdio.h>

// int max(int *, int);   // function prototype

// void main()
// {
//     int arr[5];

//     printf("Enter 5 elements:\n");

//     for(int i = 0; i < 5; i++)
//     {
//         scanf("%d", &arr[i]);
//     }

//    int a= max(arr, 5);   // call by reference using pointer

//     printf("Sorted array in ascending order:\n");

  
//         printf("%d ", a);
    

//     // return 0;
// }

// int  max(int *p, int n)
// {
//    int max=*p;

//     for(int i = 0; i < n +1; i++)
//     {
//         if(max<*(p+i)){
//             max=*(p+i);
//         }
        
//         }
//         return max;
//     }




































































































































