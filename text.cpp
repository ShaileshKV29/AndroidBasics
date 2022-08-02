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

int prime(int m)
{
    for(int i = 2; i < m; i++)
    {
        if(m % i == 0)
            return -1;
    }
    return m;
}

int main()
{
    // rec(15);
    int a, b;
    cin >> a >> b;
    for(int i = a; i < b; i++)
    {
        cout << prime(i) << " ";
    }

    return 0;
}