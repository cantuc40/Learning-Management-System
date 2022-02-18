require "test_helper"

class StudentTest < ActiveSupport::TestCase
  # test "the truth" do
  #   assert true
  # end

  test "create student" do
    @student = Student.new
    assert_not @student.save
  end
end
