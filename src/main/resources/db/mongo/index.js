// This file is used to create indexes in the MongoDB database.
// this will create a unique index on the userId and profileId fields in the follow collection.
db.follow.createIndex(
  { userId: 1, profileId: 1 },
  { unique: true, name: "user_profile_unique_idx" }
)