# test_chop.py

def chop(value, values):
    start = 0
    end   = len(values) - 1

    while(end >= start):
        mid_idx = (start + end) / 2
        mid_val = values[mid_idx]

        if mid_val == value:
            return mid_idx
        elif value > mid_val:
            start = mid_idx + 1
        else:
            end = mid_idx - 1

    return -1


def test_karate_chop():
    assert chop(3, [])  == -1
    assert chop(3, [1]) == -1
    assert chop(1, [1]) == 0
    assert chop(3, [1, 3, 5]) == 1
    assert chop(5, [1, 3, 5]) == 2
    assert chop(0, [1, 3, 5]) == -1
    assert chop(2, [1, 3, 5]) == -1
    assert chop(4, [1, 3, 5]) == -1
    assert chop(6, [1, 3, 5]) == -1
    assert chop(1, [1, 3, 5, 7]) == 0
    assert chop(3, [1, 3, 5, 7]) == 1
    assert chop(5, [1, 3, 5, 7]) == 2
    assert chop(7, [1, 3, 5, 7]) == 3
    assert chop(0, [1, 3, 5, 7]) == -1
    assert chop(2, [1, 3, 5, 7]) == -1
    assert chop(4, [1, 3, 5, 7]) == -1
    assert chop(6, [1, 3, 5, 7]) == -1
    assert chop(8, [1, 3, 5, 7]) == -1
