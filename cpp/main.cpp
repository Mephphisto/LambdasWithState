#include <iostream>
int counter = 0;
int incr(){
    return counter++;
}

int main() {
    auto glambda = []() { return incr(); };
    std::cout << glambda() << std::endl;
    std::cout << glambda() << std::endl;
    std::cout << glambda() << std::endl;
    return 0;
}