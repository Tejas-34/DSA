# 🧩 Sort Colors  
**LeetCode 75 – Sort Colors**

🔗 **Problem Link:** https://leetcode.com/problems/sort-colors/description/

---

## 📌 Problem Statement

> Given an array nums with n objects colored red, white, or blue, sort them in-place  
> so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
> We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

> You must solve this problem without using the library's sort function.

---

## 💡 Intuition

- It's Simple Count Sort Problem
- We have only 3 variable to sort. range is smaller 0-2
- So count the occurance of an elements. then add that element to nums by there count

---

## 🛠️ Approach

1. Create a array having size 3
2. Count the each element occurance 
3. then add the elements by there frequancy. 

---

## 🧪 Example Walkthrough

**Input:**
nums = [2,0,2,1,1,0]

**Explanation:**
- Step 1: Initilize count = [0,0,0]
- Step 2: Count count= [2,2,2]
- Step 3: Add 2 each in nums again: [0,0,1,1,2,2]
- Step 4: Solved

**Output:**
[0,0,1,1,2,2]

---

## ⏱️ Time & Space Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`
- Space is 1 because we are using only array of size 3. which is constant

---

## ✅ Code (Java)

```java
class Solution {
    public void sortColors(int[] nums) {
        int count[] = new int[3];

        for(int i=0; i<nums.length; i++)
            count[nums[i]]++;
        
        int j = 0;
        for(int i=0; i<3; i++){
            while(count[i] > 0){
                nums[j++] = i;
                count[i]--;
            }
        }
    }
}
