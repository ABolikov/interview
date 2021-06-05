with `interval` as (
    select schedule.id_film,
           schedule.id                                                as schedule_id,
           film.name,
           film.time,
           schedule.session_time,
           DATE_ADD(schedule.session_time, interval film.time MINUTE) as end_time
    from schedule
             join film on schedule.id_film = film.id
)
select film1.name,
       film1.session_time,
       film1.time,
       film2.name,
       film2.session_time,
       TIMESTAMPDIFF(MINUTE, film1.end_time, film2.session_time) as break
from `interval` film1
         join `interval` film2 on film1.end_time < film2.session_time
    and TIMESTAMPDIFF(MINUTE, film1.end_time, film2.session_time) >= 30
order by break desc;