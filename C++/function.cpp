#include <iostream>

using namespace std;

const float PIE = 3.141592;

void cheers(int n);
float circle(int x);
void helloCPP(int, int);

struct Time
{
  int hours;
  int mins;
};
const int minsPerHr = 60;

int main()
{

  int a;
  cout << "Please enter a number." << endl;
  cin >> a;
  cheers(a);

  int b;
  cout << "Please enter another number." << endl;
  cin >> b;
  float c = circle(b);
  cout << "Size of circle is " << c << endl;

  int times, times2;
  cout << "Please enter a new number" << endl;
  cin >> times;
  cout << "Please enter another number" << endl;
  cin >> times2;
  helloCPP(times, times2);

  return 0;
}

void cheers(int n)
{
  for (int i = 0; i < n; i++)
  {
    cout << "Cheers!" << endl;
  }
}

float circle(int x)
{
  return x * x * PIE;
}

void helloCPP(int n, int m)
{
  for (int i = 0; i < n; i++)
  {
    cout << "Hello" << endl;
    for (int i = 0; i < m; i++)
    {
      cout << "C++!" << endl;
    }
  }
}