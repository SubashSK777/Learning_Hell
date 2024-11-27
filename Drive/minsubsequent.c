#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    vector<int>a(n);
    for(int i=0;i<n;i++)
        cin>>a[i];
    long int mini=INT_MAX;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            long int sum=0;
            for(int k=j+1;k<n;k++)
            {
                if(a[j]>a[i] && a[j]>a[k])
                {
                    sum=a[i]+a[j]+a[k];
                    mini=min(mini,sum);
                }  
            }
        }
    }
}