#include <iostream>
#include <algorithm>
using namespace std;


int compare(string s1, string s2) {

        int i = 0;

        while (i < s1.length() && i < s2.length()) {

            if (s1[i] > s2[i]) {

                return 1;
            } else if (s1[i] < s2[i]) {
                return -1;
            }
            i++;

        }

        if (s1.length() > s2.length()) {
            return -1;
        } else {
            return 1;
        }

    }
    /*
void sortfunc(string arr[], int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (compareTo(arr[j], arr[j + 1]) > 0) {

                    string temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

    }
*/
int main()
{

    int n;
    cin>>n;
    string* str = new string[n];
    cin.ignore();
    for(int i=0;i<n;i++)
    {
        cin>>str[i];
    }
    sort(str,str+n, compare);
    for(int i=0;i<n;i++)
    {
        cout<<str[i]<<endl;
    }
}
