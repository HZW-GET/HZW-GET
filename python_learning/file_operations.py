# 文件操作示例
# 写入文件
with open("example.txt", "w") as file:
    file.write("Hello, file!")

# 读取文件
with open("example.txt", "r") as file:
    content = file.read()
    print(content)