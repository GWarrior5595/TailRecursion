RubyVM::InstructionSequence.compile_option = {
  tailcall_optimization: true,
  trace_instruction: false
}

def factorial_recursion(number)
  raise IndexError if number < 0

  return 1 if number == 0

  number * factorial_recursion(number - 1)
end

RubyVM::InstructionSequence.new(<<-EOF).eval
def factorial_tail_recursion(number, factorial = 1)
  raise IndexError if number < 0

  return factorial if number == 0

  factorial_tail_recursion(number - 1, factorial * number)
end
EOF