#include<iostream>
#include<vector>
using namespace std;

// Student class to make student object with their name and marks.
class Student{
    public:
        int marks;
        string name;
};

// A function to run Bucket Sort on the given array of marks.
void bucketSort(Student s[], int n){

    // Assuming marks are in the range 0-100.
    vector<Student> v[101];

    // O(n) time.
    for(int i = 0; i<n; i++){
        // marks of each student.
        int m = s[i].marks;
        // pushing students into the vector.
        v[m].push_back(s[i]);
    }

    // Iterate over the vector and print the students.
    for(int i = 0; i<=100; i++){
        for(vector<Student>::iterator it = v[i].begin(); it!=v[i].end();it++){
            cout<<(*it).marks<<"  "<<(*it).name<<endl;
        }
    }

}


// Driver program to test the above function.
int main(){
    // Array of students
    Student s[1000];
    // Number of students
    int n;
    cin>>n;
    for(int i = 0; i<n; i++){
        cin>>s[i].marks>>s[i].name;
    }
    bucketSort(s, n);
    return 0;
}