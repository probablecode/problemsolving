#include <stdio.h>
void	recur(int l[], int idx, int nums[], int numlen)
{
	if (idx == 6)
	{
		printf("%d %d %d %d %d %d\n"
				, nums[l[0]], nums[l[1]], nums[l[2]]
				, nums[l[3]], nums[l[4]], nums[l[5]]);
		return ;
	}

	int min = 0 < idx ? l[idx - 1] + 1 : 0;
	for (int i = min; i < numlen - 5 + idx; i++)
	{
		l[idx] = i;
		recur(l, idx + 1, nums, numlen);
	}
}

int	main(void)
{
	int nums[12];
	int lottery[6];
	while (1)
	{
		int numlen;
		scanf("%d", &numlen);
		if (numlen == 0)
			break;
		for (int i = 0; i < numlen; i++)
			scanf("%d", nums + i);
		recur(lottery, 0, nums, numlen);
        printf("\n");
    }
	return 0;
}