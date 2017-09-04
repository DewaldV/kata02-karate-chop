package main

func Chop(searchVal int, numbers []int) int {
  start := 0
  end   := len(numbers)

  for start < end {
    mid := (start + end) / 2

    if searchVal == numbers[mid] {
      return mid
    } else if searchVal > numbers[mid] {
      start = mid + 1
    } else {
      end = mid
    }
  }

  return -1
}

func main() {
  Chop(1, []int{})
}
