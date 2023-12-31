package com.example.a7minutesworkout

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(1,
            "ジャンピングジャック",
            R.drawable.ic_jumping_jacks,
            false, false
        )
        exerciseList.add(jumpingJacks)

        val wallSit = ExerciseModel(
            2,
            "壁座り",R.drawable.ic_wall_sit,
            false,false
        )
        exerciseList.add(wallSit)

        val pushUp = ExerciseModel(
            3,
            "腕立て伏せ",R.drawable.ic_push_up,
            false,false
        )
        exerciseList.add(pushUp)

        val abdominalCrunch = ExerciseModel(
            4,
            "腹筋の引き締め",
            R.drawable.ic_abdominal_crunch,
            false,false
        )
        exerciseList.add(abdominalCrunch)

        val stepUpOnChair = ExerciseModel(
            5,
            "椅子を使ったステップアップ",
            R.drawable.ic_step_up_onto_chair,
            false,false
        )
        exerciseList.add(stepUpOnChair)

        val squat = ExerciseModel(
            6,
            "スクアット",
            R.drawable.ic_squat,
            false,false
        )
        exerciseList.add(squat)

        val tricepDipOnChair = ExerciseModel(
            7,
            "椅子を使った腕の運動",
            R.drawable.ic_triceps_dip_on_chair,
            false,false
        )
        exerciseList.add(tricepDipOnChair)

        val plank = ExerciseModel(
            8,
            "プランク",
            R.drawable.ic_plank,
            false,false
        )
        exerciseList.add(plank)

        val highKneesRunningInPlace = ExerciseModel(
            9,
            "その場駆け足",
            R.drawable.ic_high_knees_running_in_place,
            false,false
        )
        exerciseList.add(highKneesRunningInPlace)

        val  lunges = ExerciseModel(
            10,
            "ランジ",
            R.drawable.ic_lunge,
            false,false
        )
        exerciseList.add(lunges)

        val pushupAndRotation = ExerciseModel(
            11,
            "腕立て伏せとロテーション",
            R.drawable.ic_push_up_and_rotation,
            false,false
        )
        exerciseList.add(pushupAndRotation)

        val sidePlank = ExerciseModel(
            12,
            "サイドプランク",
            R.drawable.ic_side_plank,
            false,false
        )
        exerciseList.add(sidePlank)
        return exerciseList
    }
}