#include<stdio.h>
#include<conio.h>
void main()
{
 int i;
 char input,vowels[4];
 scanf("%c",input);
 for(i=0;i<=4;i++)
 {
  if(input==vowels[i])
   {
    printf("It is a vowel");
    break;
   }
   else
    printf("It is a consonant");
  }
}
