#include <bits/stdc++.h>
using namespace std;

int findOccurrence(int arr[], int n, int element) {
    int l = 0;
    int r = n - 1;
    int ans = -1;

    while (l <= r) {
        int mid = l + (r - l) / 2;
        if (arr[mid] == element) {
            ans = mid;
            r = mid - 1;  // Continue searching in the left half for the first occurrence
        } else if (arr[mid] < element) {
            l = mid + 1;
        } else {
            r = mid - 1;
        }
    }
    return ans;
}

int main() {
    int arr[] = {2, 4, 10, 10, 10, 18, 20};
    int n = sizeof(arr) / sizeof(arr[0]); // Calculate the size of the array correctly
    int e = 10;

    int firstOccurrence = findOccurrence(arr, n, e);

    if (firstOccurrence != -1) {
        cout << "First occurrence of " << e << " is at index: " << firstOccurrence << endl;
    } else {
        cout << e << " is not found in the array." << endl;
    }

    return 0;
}

