#include <algorithm>
#include <iostream>

template<size_t N>
void bubbleSort(int (&arr)[N]) { 
   using std::swap;
   
   for (int i = 0; i < N-1; i++) {
       for (int j = 0; j < N-i-1; j++) { 
           if (arr[j] > arr[j+1]) { 
               swap(arr[j], arr[j+1]); 
            }
        }
    }
}

/* Function to print an array */
template<size_t N>
void print(int (&arr)[N]) { 
    for (const auto& i : arr) {
        std::cout << i << " ";
    }    
    std::cout << std::endl;  
}
  
int main() { 
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    bubbleSort(arr); 
    print(arr); 
    return 0; 
}
