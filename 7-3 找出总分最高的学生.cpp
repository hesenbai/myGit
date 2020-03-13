 #include<stdio.h>
 #include<string.h>
 struct biao{
 	char num[6];
 	char name[11];
 	int g1,g2,g3,sum;
 }; 
 int main ()
 {
 	int i,n;
 	struct biao s1,max;
 	
 	scanf("%d",&n);
 	
 	for(i=1;i<=n;i++)
	   {
	     scanf("%s %s",s1.num,s1.name);
	     scanf("%d %d %d",&s1.g1,&s1.g2,&s1.g3);
	     s1.sum=s1.g1+s1.g2+s1.g3;
	     if(i==1) max=s1;
	     if(max.sum<s1.sum)
	       max=s1;
	   }
   
   printf("%s %s %d",max.name,max.num,max.sum);
 }
