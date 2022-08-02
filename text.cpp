#include<iostream>
using namespace std;

void rec(int n, int i = 1)
{
    // static int i = 1;
    if(i < 11)
    {
    cout << n * i << endl;
    rec(n, i + 1);
    }
}

int main()
{
    rec(15);

    return 0;
}