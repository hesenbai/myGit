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
		scanf("\n");	/* ����Ϊgets���������⣬��һ������n�ǻس���������������� 
						�ⲿ����ôgets�������յ��ľ��ǻس���\n�������ͽ����ˣ��� 
						û�а�ʵ��Ҫ����ַ������롣 
						�Ժ������Ҫ�����ַ�������ǰ���ֳ�����scanf��������һ���� 
						�Ϳ��Բ���forѭ�����룬ֱ��ʹ��gets*/
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
