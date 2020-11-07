#include <iostream>
using namespace std;

 void TestFunc(int &rParam) {
  rParam = 100;
}

int main() {
  int nData = 0;
  TestFunc(nData);
  cout<< nData << endl;
  return 0;

}

int end() {
  int aList[5] = {10,20,30,40,50,} ;
  for(auto n : aList)
    cout << n << ' ';
cout << endl;

  for(auto &n : aList)
    cout << n << ' ';
cout << endl;

return 0;
}


int main() {
  int R[10] ;
  int Temp;
  for (int i=0; i<10; i++) {
    cin >> R[i];
  }
  for (int i=0; i<10; i++) {
    Temp=Temp+R[i];

  }
  cout << Temp << endl;
  cout << Temp/(double)10 << endl;
  return 0;
}


struct CUSTOMER {
  char name[10];
  int age;
  char sex;
  
};


int main() {
  CUSTOMER customer[10];
  //위 매개상속
  int num = 0;
  char menu;
  for (int i=0; true;) {
    cin >> i;
  switch(i) {
    case 1:
    if(num<10) {
    cout << "이름" << endl;
    cin >> customer[num].name;
    cout << "나이" << endl;
    cin >> customer[num].age;
    cout << "성별" << endl;
    cin >> customer[num].sex;
      num=num+1;
    break;
    }else {
      cout<< "Error" <<endl;
    }

    case 2:
    for (int i=0; i<num; i++) {
      cout << customer[i].name << endl;
      cout << customer[i].age << endl;
      cout << customer[i].sex << endl;
    }

    case 3:
    cout << "종료";
    break;
  }
}
}
