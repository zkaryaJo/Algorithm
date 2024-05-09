#include <stdio.h>
#include <stdlib.h>

int Min(int a,int b);

int main(void)
{
	int i,j,routeA=0,routeB=0,routeC=0,preA=0,preB=0,preC=0;
	int input;

	int result=0;
	int arr[1000][3];

	scanf("%d",&input);

		for(i=0;i<input;i++){
			for(j=0;j<3;j++){
				scanf("%d",&arr[i][j]);
			}
	}

	for(i=0;i<input;i++){
		routeA=Min(preB,preC)+arr[i][0];
		routeB=Min(preA,preC)+arr[i][1];
		routeC=Min(preA,preB)+arr[i][2];
		preA=routeA;
		preB=routeB;
		preC=routeC;
	}
	result=Min(routeA,routeB);
	result=Min(routeC,result);

	printf("%d",result);

    return 0;
}

int Min(int a,int b){
	if(a>b)
	return b;
	else
	return a;
}
