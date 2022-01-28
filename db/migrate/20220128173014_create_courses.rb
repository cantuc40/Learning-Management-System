class CreateCourses < ActiveRecord::Migration[7.0]
  def change
    create_table :courses do |t|
      t.references :student, null: false, foreign_key: true
      t.string :name
      t.integer :number
      t.string :name_abbrev
      t.integer :course_id
      t.text :prereqs
      t.text :description
      t.integer :grade
      t.string :professor
      t.string :letter_grade
      t.string :semester
      t.integer :year

      t.timestamps
    end
  end
end
