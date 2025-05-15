# Quiz 2

This Java project demonstrates list manipulation using integer-based indexing and safe access techniques.

## Table of Contents

1. [Description](#description)  
2. [Program Logic](#program-logic)  
3. [Expected Output](#expected-output)  
4. [Error Handling](#error-handling) 

---

## Description

This program processes two predefined lists:

- `list1`: A list of integers.
- `list2`: A list of strings.

It then generates a third list, `list3`, by using a formula to calculate indices from the values in `list1` and selecting corresponding strings from `list2`.

---

## Program Logic

- **Step 1**: Initialize `list1` with a set of integers.
- **Step 2**: Initialize `list2` with a set of strings.
- **Step 3**: For each value `n` in `list1`, calculate an index into `list2` using:
index = n + (n - 1) = 2n - 1
- **Step 4**: If the index is valid (within bounds), add the corresponding string from `list2` to `list3`.
- **Step 5**: Print all three lists.

---

## 3. Expected Output  

Below is a sample output when running the program with the provided lists:

list1 (integers): [3, 2, 3, 9, 2, 3, 8, 5, 3, 5, 2, 3, 6]
list2 (strings): [2tpA, 9N60w, DFw, mO9g6, P2WD, 6DRX2, RTVOb, RHOY, Ct2, KRbtu, Ym5Yu, MW9, 5PPzD, kem1C, hmWJ, 9XTEQ, 12x, Qzo8]
list3 (result): [mO9g6, DFw, mO9g6, Qzo8, DFw, mO9g6, Ym5Yu, 6DRX2, mO9g6, 6DRX2, DFw, mO9g6, RTVOb]

---

## Error Handling

- The program includes bounds checking to avoid IndexOutOfBoundsException.
Warning: Calculated index 17 is out of bounds for list2 (size: 18)
- For any invalid index, it prints a warning message like:
Warning: Calculated index X is out of bounds for list2 (size: Y)
- Invalid indices are skipped, ensuring the program runs smoothly even with irregular inputs.