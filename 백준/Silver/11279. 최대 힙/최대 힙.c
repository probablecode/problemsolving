#include <stdio.h>
#include <stdlib.h>
#define TOP 1
#define MAX 100001
typedef struct s_heap {
    int *e;
    int cnt;
}    t_heap;

void init_heap(t_heap *heap)
{
    heap->e = calloc(MAX, sizeof(int));
    heap->cnt = 0;
}

void free_heap(t_heap *heap)
{
    free(heap->e);
}


void swap(int *a, int *b)
{
	int tmp = *a;
	*a = *b;
	*b = tmp;
}

int pop(t_heap *heap)
{
	if (!(heap->cnt))
		return 0;
	int *el = heap->e;
    int ret = el[TOP];
	el[TOP] = el[(heap->cnt)];
	el[(heap->cnt)--] = 0;
    int idx = TOP;
	while (idx * 2 <= heap->cnt)
	{
		int lc = idx * 2;
		int rc = idx * 2 + 1;
		int a = el[idx] < el[lc];
		int b = el[idx] < el[rc];
		int c = el[lc] < el[rc];
		if (!a && !b)
			break;
		if (!a || c)
		{
			swap(el + idx, el + rc);
			idx = rc;
		}
		else if (!b || !c)
		{
			swap(el + idx, el + lc);
			idx = lc;
		}
	}
	return ret;
}

void push(t_heap *heap, int input)
{
	int idx = ++(heap->cnt);
	int *el = heap->e;
    el[idx] = input;
	while (TOP < idx)
	{
		int parent = idx / 2;
		if (el[idx] <= el[parent])
			break;
		swap(el + idx, el + parent);
		idx = parent;
	}
}

int	main(void)
{
    t_heap heap;
    init_heap(&heap);
	int N, input;
    scanf("%d", &N); getchar();
	for (int i = 0; i < N; i++)
	{
		scanf("%d", &input);
		if (i < N - 1)
			getchar();
		if (input == 0)
			printf("%d\n", pop(&heap));
		else if (0 < input)
			push(&heap, input);
	}
	free_heap(&heap);
	return 0;
}