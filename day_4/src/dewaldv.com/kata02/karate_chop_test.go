package main

import "testing"

func TestChop(t *testing.T) {
  testCases := []struct {
    expected int
    search   int
    values   []int
  }{
    { -1, 3, []int{} },
    { -1, 3, []int{1} },
    { 0,  1, []int{1} },
    { 0,  1, []int{1, 3, 5} },
    { 1,  3, []int{1, 3, 5} },
    { 2,  5, []int{1, 3, 5} },
    { -1, 0, []int{1, 3, 5} },
    { -1, 2, []int{1, 3, 5} },
    { -1, 4, []int{1, 3, 5} },
    { -1, 6, []int{1, 3, 5} },
    { 0,  1, []int{1, 3, 5, 7} },
    { 1,  3, []int{1, 3, 5, 7} },
    { 2,  5, []int{1, 3, 5, 7} },
    { 3,  7, []int{1, 3, 5, 7} },
    { -1, 0, []int{1, 3, 5, 7} },
    { -1, 2, []int{1, 3, 5, 7} },
    { -1, 4, []int{1, 3, 5, 7} },
    { -1, 6, []int{1, 3, 5, 7} },
    { -1, 8, []int{1, 3, 5, 7} },
  }

  for _, testCase := range testCases {
    actual := Chop(testCase.search, testCase.values)

    if actual != testCase.expected {
      t.Errorf("Incorrect index returned for search: %d, values: %d. Expected: %d but got: %d", testCase.search, testCase.values, testCase.expected, actual)
    }
  }

}
