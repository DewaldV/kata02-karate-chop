# test_chop.py
import pytest

def chop(search_val, numbers, start_idx=0):
    if len(numbers) == 0:
        return -1

    mid_idx = (len(numbers) // 2)

    if search_val < numbers[mid_idx]:
        return chop(search_val, numbers[:mid_idx], start_idx)
    elif search_val > numbers[mid_idx]:
        new_idx = mid_idx + 1
        return chop(search_val, numbers[new_idx:], new_idx + start_idx)

    return mid_idx + start_idx

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
