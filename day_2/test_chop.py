# test_chop.py
import pytest

def chop(search_val, numbers):
    start = 0
    end   = len(numbers) - 1

    while(end >= start):
        mid = (start + end) // 2

        if search_val == numbers[mid]:
            return mid
        elif search_val > numbers[mid]:
            start = mid + 1
        else:
            end = mid - 1

    return -1

@pytest.mark.parametrize("expected,search_val,numbers", [
    (-1, 3, []),
    (-1, 3, [1]),
    (0, 1, [1]),
    (1, 3, [1, 3, 5]),
    (2, 5, [1, 3, 5]),
    (-1, 0, [1, 3, 5]),
    (-1, 2, [1, 3, 5]),
    (-1, 4, [1, 3, 5]),
    (-1, 6, [1, 3, 5]),
    (0, 1, [1, 3, 5, 7]),
    (1, 3, [1, 3, 5, 7]),
    (2, 5, [1, 3, 5, 7]),
    (3, 7, [1, 3, 5, 7]),
    (-1, 0, [1, 3, 5, 7]),
    (-1, 2, [1, 3, 5, 7]),
    (-1, 4, [1, 3, 5, 7]),
    (-1, 6, [1, 3, 5, 7]),
    (-1, 8, [1, 3, 5, 7])
])
def test_karate_chop(expected, search_val, numbers):
    assert chop(search_val, numbers) == expected
