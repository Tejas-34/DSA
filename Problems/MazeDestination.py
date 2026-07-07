from collections import deque

def shortestPath(mat):
    n, m = len(mat), len(mat[0])

    # If start or end is blocked
    if mat[0][0] == -1 or mat[n-1][m-1] == -1:
        return None, -1  # No path

    # Directions: down, right, up, left
    directions = [(1, 0), (0, 1), (-1, 0), (0, -1)]

    # Queue stores (i, j, path)
    q = deque([(0, 0, [(0, 0)])])

    # Visited matrix
    visited = [[False]*m for _ in range(n)]
    visited[0][0] = True

    step = 0  # To track iteration count

    while q:
        step += 1
        print(f"\n🔹 Step {step}: Current Queue = {list(q)}")  # Debug print

        i, j, path = q.popleft()
        print(f"   Processing cell: ({i}, {j}), Path so far: {path}")

        # If destination reached
        if i == n-1 and j == m-1:
            print("\n✅ Destination reached!")
            return path, len(path) - 1

        # Explore neighbors
        for di, dj in directions:
            ni, nj = i + di, j + dj

            if 0 <= ni < n and 0 <= nj < m and not visited[ni][nj] and mat[ni][nj] != -1:
                visited[ni][nj] = True
                new_path = path + [(ni, nj)]
                print(f"   ➕ Adding to queue: ({ni}, {nj}), New path: {new_path}")
                q.append((ni, nj, new_path))

    print("\n❌ No path found.")
    return None, -1


if __name__ == "__main__":
    mat = [
        [0, 0, 0],
        [0, -1, 0],
        [0, 0, 0]
    ]

    path, distance = shortestPath(mat)

    if path:
        print("\nFinal Shortest Path:", " -> ".join(map(str, path)))
        print(f"Shortest Distance: {distance}")
    else:
        print("No valid path found.")
