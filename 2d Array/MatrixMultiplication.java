import java.util.Scanner;
class MatrixMultiplication
{
public static void main(String args[])
{
int r1, c1, r2, c2, sum = 0, c, d, k;
Scanner in = new Scanner(System.in);

System.out.println("Enter the number of rows and columns of first matrix");

r1 = in.nextInt();
c1 = in.nextInt();
int first[][] = new int[r1][c1];
System.out.println("Enter elements of first matrix");
for (c = 0; c<r1; c++)
for (d = 0; d<c1; d++)
first[c][d] = in.nextInt();
System.out.println("Enter the number of rows and columns of second matrix");
r2 = in.nextInt();
c2 = in.nextInt();
if (c1 != r2)
System.out.println("The matrices cannot be munltiplied with each other");
else
{
int second[][] = new int[r2][c2];
int multiply[][] = new int[r1][c2];

System.out.println("Enter elements of second matrix");
for (c = 0; c<r2; c++)
for (d = 0; d<c2; d++)
second[c][d] = in.nextInt();
for (c = 0; c<r1; c++)
{
for (d = 0; d<c2; d++)
{
for (k = 0; k<r2; k++)
{
sum = sum + first[c][k]*second[k][d];
}
multiply[c][d] = sum;
sum = 0;
}
}
System.out.println("Product of the matrices:");
for (c = 0; c<r1; c++)
{
for (d = 0; d<c2; d++)
System.out.print(multiply[c][d]+"\t");
System.out.print("\n");}}}}
