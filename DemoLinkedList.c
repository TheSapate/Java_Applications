#include<stdio.h>
#include<stdlib.h>

struct node
{
	int Data;
	struct node *next;
};
typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void InsertFirst(PPNODE Head,int no)
{
	PNODE newn=NULL;  
	
	//Step1:-Allocate the memory
	newn=(PNODE)malloc(sizeof(NODE));
	
	//Step2:-Initialise the Node
	newn->Data=no;
	newn->next=NULL;
	
	//Step3:-Insert the Node
	if(*Head==NULL)  //LL is Empty
	{
		*Head=newn;
	}
	else             //LL contains Atleat one Node
	{
		newn->next=*Head;
		*Head=newn;
	}
}

void InsertLast(PPNODE Head,int no)
{
	PNODE newn=NULL;  
	PNODE temp=*Head;
	//Step1:-Allocate the memory
	newn=(PNODE)malloc(sizeof(NODE));
	
	//Step2:-Initialise the Node
	newn->Data=no;
	newn->next=NULL;
	
	//Step3:-Insert the Node
	if(*Head==NULL)  //LL is Empty
	{
		*Head=newn;
	}
	else             //LL contains Atleat one Node
	{
		while(temp->next!=NULL)
		{
			temp=temp->next;
		}
		temp->next=newn;
	}
}

void Display(PNODE Head)
{
	while(Head!=NULL)
	{
		printf("%d\t",Head->Data);
		Head=Head->next;
	}
}

int Count(PNODE Head)
{
	int iCnt=0;
	while(Head!=NULL)
	{
		iCnt++;
		Head=Head->next;
	}
	return iCnt;
}
void DeleteFirst(PPNODE Head)
{
	PNODE temp=*Head;
	if(*Head!=NULL)  //IF LL contains Atleast one node
	{
		*Head=(*Head)->next;
		free(temp);
	}
}
void DeleteLast(PPNODE Head)
{
	PNODE temp=*Head;
	if(*Head==NULL) //if LL is Empty
	{
		return;
	}
	else if((*Head)->next==NULL)  //if LL contains one node
	{
		free(*Head);
		*Head=NULL;
	}
	else
	{
		while(temp->next->next!=NULL)
		{
			temp=temp->next;
		}
		free(temp->next);
		temp->next=NULL;
	}
}
int main()
{
	PNODE first=NULL;
	int iRet=0;
	
	InsertFirst(&first,101);
	InsertFirst(&first,51);  //Insert(50,51)
	InsertFirst(&first,21);  //Insert(50,21)
	InsertFirst(&first,11);  //Insert(50,11)
	
	InsertLast(&first,111);
	Display(first);
	iRet=Count(first);
	printf("Count of Node is :%d\n",iRet);
	
	DeleteFirst(&first);
	Display(first);
	iRet=Count(first);
	printf("Count of Node is :%d\n",iRet);
	
	DeleteLast(&first);
	Display(first);
	iRet=Count(first);
	printf("Count of Node is :%d\n",iRet);
	return 0;
}

/*
void InsertFirst(PPNODE Head,int no)
void InsertLast(PPNODE Head,int no)
void InsertAtPos(PPNODE Head,int no,int pos)

void DeleteFirst(PPNODE Head)
void DeleteLast(PPNODE Head)
void DeleteAtPos(PPNODE Head,int pos)

void Display(PNODE Head)
int Count(PNODE Head)
*/
