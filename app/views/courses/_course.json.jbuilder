json.extract! course, :id, :student_id, :name, :number, :name_abbrev, :course_id, :prereqs, :description, :grade, :professor, :letter_grade, :semester, :year, :created_at, :updated_at
json.url course_url(course, format: :json)
