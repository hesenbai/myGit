#include<stdio.h>
#include<string.h>
struct biao{
	double price;
	char bname[31];
}; 
int main (void)
{
	int i,n;
	struct biao s1,max,min;
	
	scanf("%d",&n);
	getchar();
	
	for (i=1;i<=n;i++)
	{	
		scanf("\n");	/* 是因为gets函数的问题，上一个输入n是回车键结束，如果不加 
						这部，那么gets函数接收到的就是回车（\n），它就结束了，并 
						没有把实际要输的字符串输入。 
						以后出现需要输入字符串但是前面又出现了scanf不妨加这一步， 
						就可以不用for循环输入，直接使用gets*/
		gets(s1.bname);
		scanf("%lf",&s1.price);
		
		if(i==1) max=min=s1;
		
		if(max.price<s1.price)
		{
			max=s1;
		}
		if(min.price>s1.price)
		{
			min=s1;
		}
		
		
	}
	
	if(n==1) printf("%.2lf,%s\n",s1.price,s1.bname);
	else 
		{
			printf("%.2lf,%s\n",max.price,max.bname);
			printf("%.2lf,%s",min.price,min.bname);
		}

}
